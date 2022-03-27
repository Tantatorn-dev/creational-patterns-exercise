package creational.structural;

import java.util.Set;

public class HealthcareWorkerTeam {
    private Set<HealthcareServiceable> members;

    public void addMember(HealthcareServiceable member) {
        members.add(member);
    }

    public void removeMember(HealthcareServiceable member) {
        members.remove(member);
    }


}
