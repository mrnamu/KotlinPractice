package chap06.section3;

public class KCustomerAccess {
    public static void main(String[] args) {
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();
        KCustomer.Companion.login();

        // KJob에 대한 객체 생성 후 접근
        KJob kJob = KCustomer.JOB;
        System.out.println(kJob.getTitle());

        KCustomer.JOB.setTitle("Accountant");
        System.out.println(KCustomer.JOB.getTitle());
    }
}
