package l6ap1;

public class CAAddressAdapter extends AddressValidator {

    private CAAddress cad;

    public CAAddressAdapter(CAAddress cad) {
        this.cad = cad;
    }
    
    @Override
    public boolean isValidAddress(String inp_address, String inp_zip, String inp_state) {
        return cad.isValidCanadianAddress(inp_address, inp_zip, inp_state);
    }

}
