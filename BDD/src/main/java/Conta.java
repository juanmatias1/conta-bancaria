import cucumber.api.PedingException;
import cucumber.java.en.Given;
import cucumber.java.en.When;
import cucumber.java.en.Then;

public class Conta {
	
	@Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
	public void um_cliente_especial_com_saldo_atual_de_reais(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PedingException();
	}
	
	@When("^for solicitado um saque no valor de (\\d+) reais$") 
	public void for_solicitado_um_saque_no_valor_de_reais(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PedingException();
	}
	
	@Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PedingException();
	}
	
	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PedingException();
	}
}
