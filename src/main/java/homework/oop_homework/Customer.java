package homework.oop_homework;

public class Customer {

    String name;
    boolean isMember;
    String memberType;

    public Customer(String name) {
        this.name = name;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return isMember;
    }

    public boolean setMember(boolean member) {
        isMember = member;
        return isMember;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String type) {
        this.memberType = type;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", isMember=" + isMember +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
