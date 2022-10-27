package esprit.tn.soa.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import esprit.tn.soa.entity.Logement;
import esprit.tn.soa.entity.RendezVous;
import esprit.tn.soa.entity.Student;
import esprit.tn.soa.repository.LogementRepository;
import esprit.tn.soa.repository.RendezVousRepository;
import esprit.tn.soa.repository.StudentRepository;

public class Query implements GraphQLRootResolver {

	private final LogementRepository logRepo;
	private final RendezVousRepository rvRepo;
	public Query(LogementRepository logRepo,RendezVousRepository rvRepo) {
		this.logRepo = logRepo;
		this.rvRepo=rvRepo;
	}
	//**************Logement*******************
	public List<Logement> allLogements() {
		return logRepo.getAllLogements();
	}
	
	public List<Logement> getLogByType(Logement.Type type ){
		return logRepo.getLogementsByType(type);
	}
	public void AddLog(Logement l) {
		logRepo.saveLogement(l);
	}
	
	public Logement getLogByRef(int ref) {
		return logRepo.getLogementsByReference(ref);
	}
	
	//**************RendezVous****************
	
	public List<RendezVous> allRendezVous() {
		return rvRepo.getListeRendezVous();
	}
	
	public List<RendezVous> getListeRendezVousByLogRef(int ref) {
		return rvRepo.getListeRendezVousByLogementRef(ref);
	}

	public boolean AddRV(RendezVous rv) {
		return rvRepo.addRendezVous(rv);
	}
	
	public boolean UpdateRV(RendezVous rv) {
		return rvRepo.updateRendezVous(rv);
	}
	
	public Logement getlogByRDV(int idrdv) {
		return rvRepo.getLogementByRDV(idrdv);
	}
	public boolean DeleteRDV(int id) {
		return rvRepo.deleteRendezVous(id);
	}
}
