package esprit.tn.soa.graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import esprit.tn.soa.entity.Logement;
import esprit.tn.soa.entity.RendezVous;
import esprit.tn.soa.repository.LogementRepository;
import esprit.tn.soa.repository.RendezVousRepository;

public class Mutation implements GraphQLRootResolver{
	
	private final LogementRepository logRepo;
	private final RendezVousRepository rvRepo;
	
	public Mutation(LogementRepository logRepo,RendezVousRepository rvRepo){
		this.logRepo = logRepo;
		this.rvRepo=rvRepo;
	}
	

	//**************Logement*******************
	
	public boolean AddLog(Logement l) {
		return logRepo.saveLogement(l);
	}
	
	//**************RendezVous****************

	public boolean AddRV(RendezVous rv) {
		return rvRepo.addRendezVous(rv);
	}
	
	public boolean UpdateRV(RendezVous rv) {
		return rvRepo.updateRendezVous(rv);
	}
	
	public boolean DeleteRDV(int id) {
		return rvRepo.deleteRendezVous(id);
	}

}
