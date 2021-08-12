import java.util.Arrays;
import java.util.Date;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class Principal {

	public static void main(String[] args) {
 		//MongoClient cliente = new MongoClient();

		String result = null;
		
		MongoClient cliente = MongoClients.create(); // ("mongodb://localhost:27017");
//		MongoClient mongo_client_constructor2 = MongoClients.create("mongodb://hostOne:27017,hostTwo:27018");
		
		result = cliente.getClass().toString();
	    System.out.println("Result : " + result);
	    
//		result = mongo_client_constructor2.getClass().toString();
//	    System.out.println("Result : " + result);
	    
	    MongoDatabase bancoDeDados = cliente.getDatabase("dbCurso");
	    MongoCollection<Document> alunos = bancoDeDados.getCollection("alunos");
	    
	    Document aluno = alunos.find().first();
	    System.out.println(alunos);
	    System.out.println(aluno);

//      Insere aluno	    
//	    Document novoAluno = new Document("nome", "Joao")
//	    	.append("data_nascimento", new Date(2003, 10, 10))
//	    	.append("curso", new Document("nome", "Historia"))
//	    	.append("notas", Arrays.asList(10, 9, 8))
//	    	.append("habilidades", Arrays.asList(new Document()
//	    			               					 .append("nome", "Ingles")
//	    			               					 .append("nível", "Básico"),
//	    			               					 new Document()
//	    			               					 .append("nome", "Espanhol")
//	    			               					 .append("nível", "Básico")));
//	    
//	    alunos.insertOne(novoAluno);
	    
//      Atualizar aluno    
//	    alunos.updateOne(Filters.eq("nome", "Joao"),
//	    		         new Document("$set", new Document("nome", "Joao Silva")));
	    
//      Deletar alunos	        
//	    alunos.deleteOne(Filters.eq("nome", "Joao Silva"));
	    
	    
	    cliente.close();

	}

}
