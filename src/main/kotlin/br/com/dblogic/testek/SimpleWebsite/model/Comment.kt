package br.com.dblogic.testek.SimpleWebsite.model

import org.hibernate.annotations.GenericGenerator
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Entity
@Table(name = "tb_comment")
class Comment(@Id
			  @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
			  @GenericGenerator(name = "native", strategy = "native")
			  val id: Long,
			  
			  @NotNull
			  var review: String) {

	
}