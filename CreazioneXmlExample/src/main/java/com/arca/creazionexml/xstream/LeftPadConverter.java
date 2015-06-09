package com.arca.creazionexml.xstream;

import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;


import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

/**
 * Converter che si occupa di fare un left pad dell'oggetto passato in input Questo permette di stampare sull'XML di stampa una
 * stringa formattata correttamente (utile se si utilizza XStream) <br>
 * La conversione � possibile solo per Integer, Long, Double, BigDecimal e String <br>
 * <code>
 * <br>
 *          ""      --> "000000"
 *          <br>
 *          null    --> ""
 *          <br>
 *          "168"   --> "000168"
 *          <br>
 *          "13551355" (nChar 4)   --> "13551355"
 * </code>
 * @author Giuseppe Giordano - Addvalue
 */
public class LeftPadConverter extends AbstractSingleValueConverter
{

    private int    nChar;

    private String charToPad;

    /**
     * Costruttore avente come parametri il numero di caratteri e il carattere da aggiungere a sinistra
     * @param nChar
     *            numero di caratteri della stringa output
     * @param charToPad
     *            caratteri da aggiungere alla stringa di output
     */
    public LeftPadConverter(int nChar,
                            String charToPad)
    {
        super();
        this.nChar = nChar;
        this.charToPad = charToPad;
    }

    @Override
    public boolean canConvert(Class type)
    {
        return (type.equals(Integer.class) || type.equals(Long.class) || type.equals(Double.class)
                || type.equals(BigDecimal.class) || type.equals(String.class));

    }

    @Override
    public String toString(Object obj)
    {
        if ( obj != null )
        {
            return StringUtils.leftPad(obj.toString(), nChar, charToPad);
        }
        else
        {
            return StringUtils.EMPTY;
        }
    }

    @Override
    public Object fromString(String str)
    {
        //XXX: Va fatto in maniera furba, in modo che torni un Oggetto corretto e non sempre e solo una stringa
        return StringUtils.leftPad(str, nChar, charToPad);
    }
}
