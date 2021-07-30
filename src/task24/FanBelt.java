package task24;

public class FanBelt extends Belt{
    public static class Factory implements task24.Factory<FanBelt>{
        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}
