import implementation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

public class TestApp {
    public static void main(String[] args) {
        FullTimeMentor fullTimeMentor = new FullTimeMentor();

        MentorAccount mentorAccount = new MentorAccount(fullTimeMentor);
        mentorAccount.manageAccount();

        PartTimeMentor partTimeMentor = new PartTimeMentor();
        partTimeMentor.createAccount();
    }
}
