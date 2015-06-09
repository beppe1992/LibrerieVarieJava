package com.arca.mongodb;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class Avt005TbService implements IService {

	@Autowired
	private MongoTemplate mongoTemplate;

	public static final String COLLECTION_NAME = "avt005tb";

	public void addDto(Avt005Tb dto) {
		if (!mongoTemplate.collectionExists(Avt005Tb.class)) {
			mongoTemplate.createCollection(Avt005Tb.class);
		}
		Random random = new Random();

		dto.setId(random.nextLong());
		mongoTemplate.insert(dto, COLLECTION_NAME);
	}

	public List<Avt005Tb> listDto() {
		return mongoTemplate.findAll(Avt005Tb.class, COLLECTION_NAME);
	}

	public void deleteDto(Avt005Tb person) {
		mongoTemplate.remove(person, COLLECTION_NAME);
	}

	public void updateDto(Avt005Tb person) {
		mongoTemplate.insert(person, COLLECTION_NAME);
	}

	public Avt005Tb selectRecord(Integer codSoc, String codPgm) {

		Query searchRecordQuery = new Query(Criteria.where("codsoc").is("225"));

		return mongoTemplate.find(searchRecordQuery, Avt005Tb.class,
				COLLECTION_NAME).get(0);
	}

	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

}
