package chainOfResponsibility;

public interface DispenseChain {

	public void setNextChain(DispenseChain dispenseChain);

	public void dispense(Currency currency);
}
