package HRMSDemo.hrms.core.adapter;



import HRMSDemo.hrms.entities.concretes.Candidate;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements MernisService{

	
	public boolean checkIfRealCandidate(Candidate candidate) {
		KPSPublicSoapProxy client= new KPSPublicSoapProxy ();

		
		boolean result=false;
		
		try {
			result= client.TCKimlikNoDogrula(Long.parseLong(candidate.getNationalityIdentity()),
					candidate.getFirstName().toUpperCase(),
					candidate.getLastName().toUpperCase(),
					candidate.getBirthOfYear());
        } catch (Exception e) {

            System.out.println("Not a valid person");
        }
		return result;
	}

}
