import javax.inject.*;
import play.*;
import play.mvc.EssentialFilter;
import play.http.HttpFilters;
import play.mvc.*;
import play.filters.csrf.CSRFFilter;

public class Filters implements HttpFilters {

    private CSRFFilter csrfFilter;

    @Inject
    public Filters(
        CSRFFilter csrfFilter) {
        this.csrfFilter = csrfFilter;
    }

    @Override
    public EssentialFilter[] filters() {
        return new EssentialFilter[] {
            csrfFilter.asJava()
        };
    }
}
