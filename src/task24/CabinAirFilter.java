package task24;

public class CabinAirFilter extends Filter{
    public static class Factory implements task24.Factory<CabinAirFilter>{
        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}
