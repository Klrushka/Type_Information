package task24;

import javax.lang.model.type.NullType;

public class NullPart extends Part  {
    public static final Part NULL = new NullPart();
    public static class Factory implements task24.Factory<NullPart>{
        @Override
        public NullPart create() {
            return (NullPart) NULL;
        }
    }

    @Override
    public String toString() {
        return "NULL";
    }
}
