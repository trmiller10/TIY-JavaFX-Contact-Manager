package sample;

public class Contact {
    String textName;

    String textPhoneNumber;

    String textEmail;

    //constructor                                                               tell it to throw an exception
    public Contact(String textName , String textPhoneNumber , String textEmail) throws Exception{
        // validate input
        // HINT: if value type starts with capital letter ('String'), use '.equals(); lowercase ('int'), use '=='
        //if: text fields have nothing input
        if (textName.equals("") || textPhoneNumber.equals("") || textEmail.equals("")) {
            //then: throw a new exception
            throw new Exception();
        }
        this.textName = textName;
        this.textPhoneNumber = textPhoneNumber;
        this.textEmail = textEmail;
    }
    @Override
    public String toString(){
        return textName + ", " + textPhoneNumber + ", " + textEmail;
    }

}
