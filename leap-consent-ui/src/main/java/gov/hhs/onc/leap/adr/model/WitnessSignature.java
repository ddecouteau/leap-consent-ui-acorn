package gov.hhs.onc.leap.adr.model;

public class WitnessSignature {
    private String witnessName;
    private String witnessAddress;
    private String dateSigned;
    private byte[] base64EncodedSignature;

    public String getWitnessName() {
        return witnessName;
    }

    public void setWitnessName(String witnessName) {
        this.witnessName = witnessName;
    }

    public String getWitnessAddress() {
        return witnessAddress;
    }

    public void setWitnessAddress(String witnessAddress) {
        this.witnessAddress = witnessAddress;
    }

    public String getDateSigned() {
        return dateSigned;
    }

    public void setDateSigned(String dateSigned) {
        this.dateSigned = dateSigned;
    }

    public byte[] getBase64EncodedSignature() {
        return base64EncodedSignature;
    }

    public void setBase64EncodedSignature(byte[] base64EncodedSignature) {
        this.base64EncodedSignature = base64EncodedSignature;
    }
}
