package task24;

public class FuelFilter extends Filter{
    public static class Factory implements task24.Factory<FuelFilter>{

        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}
