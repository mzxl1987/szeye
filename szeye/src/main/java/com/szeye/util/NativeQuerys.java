/**
 * 
 */
package com.szeye.util;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Component;

import com.szeye.dto.Result;

/**
 * @author LuLu.Zhu
 *
 * 2020年4月2日 下午6:19:08
 */
@Component
public class NativeQuerys implements Serializable{

	
//	@Bean
	public NativeQuerys createNativeQuerys() {
		return new NativeQuerys();
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext 
	private EntityManager entityManager;
	
	@SuppressWarnings({ "rawtypes", "deprecation" })
	public Result queryAll(String sql, Class clazz,Map<String,Object> map) {
		Result r = Result.success();
		Query query = entityManager.createNativeQuery(sql).unwrap(NativeQuery.class)
				.setResultTransformer(Transformers.aliasToBean(clazz));  
	    
		if(null != map) {
			
			map.forEach((key, value) -> {
				query.setParameter(key, value);
			});
			
		}
		
	    List list = query.getResultList();
	    r.setData(list);
	    r.setTotal(list.size());
	    return r ;
	}
	
	@SuppressWarnings({ "rawtypes", "deprecation" })
	public Result queryPage(String sql, Class clazz,Map<String,Object> map,int start, int limit) {
		Result r = Result.success();
		Query query = entityManager.createNativeQuery(sql).unwrap(NativeQuery.class)
				.setResultTransformer(Transformers.aliasToBean(clazz));  
	    
		if(null != map) {
			
			map.forEach((key, value) -> {
				query.setParameter(key, value);
			});
			
		}
		
		query.setFirstResult(start);
		query.setMaxResults(limit);
		
	    List list = query.getResultList();
	    r.setData(list);
	    r.setTotal(list.size());
	    return r ;
	}
	
	
}
