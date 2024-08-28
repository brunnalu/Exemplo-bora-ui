package metodos;

import org.openqa.selenium.By;

import drivers.drivers;

//passos para criar um método
	// 1 modificador de acesso
	// 2 tipo de retorno
	// 3 nome do método
	// 4 assinatura do método
	// 5 bloco de instrução

public class metodosdetestes extends drivers {

public void escrever(By elemento,String texto) {
	
	driver.findElement(elemento).sendKeys(texto);
	
	
	
}

	
	
	
	
	

}
