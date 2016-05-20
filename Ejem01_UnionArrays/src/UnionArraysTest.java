import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
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
	public static ArrayList<Object[]> testeo(){
		
		ArrayList <Object[]> parametros = new ArrayList <Object[]> ();
		int n1[]={1,2,3,4};
		int n2[]={5,6,7,8};
		int n3[]={1,2,3,4,5,6,7,8};
		
		Object datosIniciales [] = new Object [3];
		datosIniciales [0]= n1;
		datosIniciales [1]= n2;
		datosIniciales [2]= n3;
		
		parametros.add(datosIniciales);
		
		return parametros;
		
		
	}
	
	

	@Test
	public void testMerge() {		
		UnionArrays arraysito = new UnionArrays();		
		Assert.assertArrayEquals(arraysito.merge(primero, segundo),resul);
		
	}

}
