package hdata;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import utils.ResumeManagement;
import model.Resume;

public class ResumeManagementTest {
 

 @Test
 
 public void testResumeAlreadyExists(){

 ResumeManagement rm=new ResumeManagement();
 Map<Integer,Resume> listCV= new HashMap<Integer,Resume>();
 Resume r1=new Resume("Nesrine Amamou","education", "experience", "skills");
 listCV.put(0,r1);
 Assert.assertEquals("Resume does not exist",true, rm.checkResumeExist(listCV, r1));

 }
 
 @Test

 public void testResumeDoesNotExist(){

 ResumeManagement rm=new ResumeManagement();
 Map<Integer,Resume> listCV= new HashMap<Integer,Resume>();
 Resume r1=new Resume("Nesrine Amamou","education", "experience", "skills");
 Resume r2=new Resume("Antoine Barrier","education", "experience", "skills");
 listCV.put(0,r1);
 Assert.assertEquals("Resume already exists",false, rm.checkResumeExist(listCV, r2));

 }

}