import java.util.ArrayList;
import java.util.List;

public class compte {

    String name;
    float solde=0;
    List<operation> list=new ArrayList<>();
    public compte(String name, float solde) {
        this.name = name;
        this.solde = solde;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "compte{" +
                "name='" + name + '\'' +
                ", solde=" + solde +
                '}';
    }
}
