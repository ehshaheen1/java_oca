package inheritance;

 class Saw {

    // if there is an extended class, constructor can not be private.
    // it has to be default, protected, or public.

//    private Saw () {    }

    Saw ()  {    }      // default access is valid

}
public class ImplicitSuper extends Saw{   }

