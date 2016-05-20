import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UnionArraysTest {
	
	UnionArrays ejem;
	int primero [];
	int segundo [];
	int resul [];
	
	public UnionArraysTest(int [] arr1,int [] arr2,int [] fin){
		this.primero=arr1;
		this.segundo=arr2;
		this.resul=fin;
	}
	
	
	@Parameters
	public ArrayList<int[]> testeo(){
		int n1[]={1,2,3,4};
		int n2[]={5,6,7,8};
		int n3[]={1,2,3,4,5,6,7,8};
		
		ArrayList  datos = new ArrayList <int[]>();
		
		datos.add(n1);
		datos.add(n2);
		datos.add(n3);
		
		
		return datos;
		
		
	}
	
	

	@Test
	public void testMerge() {		
				
		assertEquals();
		
	}

}
