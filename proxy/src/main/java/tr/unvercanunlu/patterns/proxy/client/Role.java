package tr.unvercanunlu.patterns.proxy.client;

public enum Role {
    ADMIN("admin"),
    USER("code");

    private final String code;

    Role(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Role{code='" + code + "'" + '}';
    }
}
