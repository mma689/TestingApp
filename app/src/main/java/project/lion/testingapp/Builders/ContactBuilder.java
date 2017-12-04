package project.lion.testingapp.Builders;

/**
 * Created by A7 on 25.11.2017.
 */

public class ContactBuilder {
    private String mName;
    private String mPhone;
    private String mEmail;
    private String mOrganization;
    private byte[] mPhotoByteArray;

    public ContactBuilder(){}

    public ContactBuilder setName(String name){
        mName = name;
        return this;
    }

    public ContactBuilder setPhone(String phone){
        mPhone = phone;
        return this;
    }

    public ContactBuilder setEmail(String email){
        mEmail = email;
        return this;
    }

    public ContactBuilder setOrganization(String organization){
        mOrganization = organization;
        return this;
    }

    public Contact build(){
        return new Contact(mName, mPhone, mEmail, mOrganization);
    }



    private class Contact{
        public String mName;
        public String mPhone;
        public String mEmail;
        public String mOrganization;
        public byte[] mPhotoByteArray;

        Contact(String name, String phone, String email, String organization){
            mName = name;
            mPhone = phone;
            mEmail = email;
            mOrganization = organization;
        }
    }
}
