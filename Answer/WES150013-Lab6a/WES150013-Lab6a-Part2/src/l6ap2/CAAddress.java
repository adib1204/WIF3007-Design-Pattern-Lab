package l6ap2;

public class CAAddress {
    public boolean isValidCanadianAddress(String inp_address, String inp_pcode, String inp_prvnc){
        if(inp_address.trim().length() < 15)
            return false;
        if(inp_pcode.trim().length() != 6)
            return false;
        if(inp_prvnc.trim().length()<6)
            return false;
        return true;
    }
}
