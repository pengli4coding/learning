package validate;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Description:对应XML文件的javabean
 * @author: 彭立
 * @date:   2018年9月25日 上午12:01:07
 *   
 */
@XmlAccessorType(XmlAccessType.FIELD)  
@XmlRootElement(name = "rules") 
public class Rule {
	@XmlElementWrapper(name = "rules")
	@XmlElement(name = "param")
	private ArrayList<Param> params;
}
