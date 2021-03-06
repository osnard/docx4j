package com.topologi.diffx.xml.esc;

/**
 * Factory for XML escape classes.
 * 
 * @author Christophe Lauret
 * @version 7 March 2005
 */
public final class XMLEscapeFactory {

  /**
   * Prevents creation of instances. 
   */
  private XMLEscapeFactory() {
  }

  /**
   * Returns an instance of a XML Escape based on the given encoding.
   * 
   * <p>This method returns <code>null</code> if the encodeing is not supported.
   *
   * @param encoding The encoding for which an escape implementation is requested. 
   *
   * @return A <code>XMLEscape</code> instance corresponding to the specified encoding
   *         or <code>null</code>.
   */
  public static XMLEscape getInstance(String encoding) {
    if ("utf-8".equals(encoding)) return XMLEscapeUTF8.UTF8_ESCAPE;
    if ("UTF-8".equals(encoding)) return XMLEscapeUTF8.UTF8_ESCAPE;
    if ("ASCII".equals(encoding)) return XMLEscapeASCII.ASCII_ESCAPE;
    else return null;
  }

}
