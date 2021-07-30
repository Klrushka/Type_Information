package task24;

public class GeneratorBelt extends Belt{
    public static class Factory implements task24.Factory<GeneratorBelt>{
        @Override
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}
