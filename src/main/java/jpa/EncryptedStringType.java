package jpa;


import com.lokdon.datashield.Constants;
import lokdon.CipherControl;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class EncryptedStringType implements UserType {

    // implement methods from UserType interface



    @Override
    public int[] sqlTypes() {
        return new int[] { java.sql.Types.VARCHAR };
    }

    @Override
    public Class returnedClass() {
        return String.class;
    }

    @Override
    public boolean equals(Object o, Object j1) {
        return Objects.equals(o, j1);
    }

    @Override
    public int hashCode(Object o) {
        return o==null ? 0 : o.hashCode();
    }

    @Override
    public Object nullSafeGet(ResultSet resultSet, String[] strings, SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException, SQLException {
        String value = resultSet.getString(strings[0]);
        System.out.println("EncryptedStringType: nullSafeGet: value: " + value);
        String decrypted= CipherControl.getInstance().decryptLargeText(value);
        System.out.println("EncryptedStringType: nullSafeGet: decrypted: " + decrypted);
        return decrypted;
    }


    public Object nullSafeGet(ResultSet resultSet, int i, SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws SQLException {
        System.out.println("EncryptedStringType: nullSafeGet: i: " + i);
        String value = resultSet.getString(i);
        // decrypt the value and return it
        System.out.println("EncryptedStringType: nullSafeGet: value: " + value);
        String decrypted= CipherControl.getInstance().decryptLargeText(value);
        System.out.println("EncryptedStringType: nullSafeGet: decrypted: " + decrypted);
        return decrypted;
    }

    @Override
    public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session) throws HibernateException, SQLException {
        //System.out.println("EncryptingStringType: nullSafeSet: index: " + index);
        //System.out.println("EncryptingStringType: nullSafeSet: value: " + value);
        // encrypt the value and store it in the database
        /*String encrypted = CipherControl.getInstance().encryptLargeText((String) value);
        //System.out.println("EncryptedStringType: nullSafeSet: encrypted: " + encrypted);
        st.setString(index, encrypted);*/
        int random= (int)(Math.random() * 10000);
        st.setString(index, Constants.jsonArray.get(random).toString());
    }

    @Override
    public Object deepCopy(Object o) {
        return o;
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public Serializable disassemble(Object o) {
        return null;
    }

    @Override
    public Object assemble(Serializable serializable, Object o) {
        return null;
    }

    @Override
    public Object replace(Object o, Object o1, Object o2) throws HibernateException {
        return null;
    }
}
