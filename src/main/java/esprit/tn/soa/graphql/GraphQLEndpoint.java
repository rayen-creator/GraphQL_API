package esprit.tn.soa.graphql;


import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;
import esprit.tn.soa.entity.RendezVous;
import esprit.tn.soa.graphql.Query;
import esprit.tn.soa.repository.LogementRepository;
import esprit.tn.soa.repository.RendezVousRepository;

@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

	
	public GraphQLEndpoint() {
		super(buildSchema());
	}
	
	private static GraphQLSchema buildSchema() {
		LogementRepository logRepo = new LogementRepository();
		RendezVousRepository rvRepo=new RendezVousRepository();
      	return SchemaParser.newParser()
				.file("schema.graphqls")
			    .resolvers(new Query(logRepo,rvRepo))
			    .build()
			    .makeExecutableSchema();
	}
}
