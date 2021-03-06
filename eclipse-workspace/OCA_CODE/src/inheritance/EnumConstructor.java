package inheritance;

public enum EnumConstructor {

    // enum constructor can have private or default scope,
    // but it can not be protected or public.

    FACEBOOK(1),
    GOOGLE(2),
    APPLE(3),
    IBM(4);

    private final int companyCode;

  //public EnumConstructor (int code) {           // does not compile, enum constructor can not be public or protected
 //       this.companyCode = code;
 //   }
    EnumConstructor (int code) {
        this.companyCode = code;
    }
}
