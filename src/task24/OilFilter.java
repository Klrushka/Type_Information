package task24;

public class OilFilter extends Filter{
    public static class Factory implements task24.Factory<OilFilter>{
        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}
