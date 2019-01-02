package l6ap2;

public class CAAddressAdapter extends CAAddress implements AddressValidator {

    @Override
    public boolean isValidAddress(String inp_address, String inp_zip, String inp_state) {
        return isValidCanadianAddress(inp_address, inp_zip, inp_state);
    }

}
