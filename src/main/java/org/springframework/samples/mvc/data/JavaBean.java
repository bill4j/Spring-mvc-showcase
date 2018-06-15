package org.springframework.samples.mvc.data;

/**
 *  A class representing a window on the screen.
 * For example:
 * <pre>
 *    Window win = new Window(parent);
 *    win.show();
 * </pre>
 * @author bill-smith
 * @version v1.0 , 二〇一八年六月十五日
 * @see org.springframework.samples.mvc.data.JavaBean#setParam1(String)
 * @deprecated use {@link org.springframework.samples.mvc.data.javaBeanTest} instead
 */
@Deprecated
public class JavaBean {

	private String param1;
	
	private String param2;
	
	private String param3;

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

    /**
     * this method is test to generate javadoc ,for generate standard javaAPI
     * For example:
     * <pre>
     *    Window win = new Window(parent);
     *    win.show();
     * </pre>
     * @param     testInput  the index of the desired character.
     * @return    the desired character.
     * @exception RuntimeException
     *              if the index is not in the range <code>0</code>
     *              to <code>length()-1</code>.
     * @deprecated use {@link #getMytestMessage2(String)} instead
     * @see       java.lang.Character#charValue()
     */
    @Deprecated
	public String getMytestMessage(String testInput){
	    return "bill test !" + testInput;
    }
    public String getMytestMessage2(String testInput){
        return "bill test !" + testInput;
    }

	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public String getParam3() {
		return param3;
	}

	public void setParam3(String param3) {
		this.param3 = param3;
	}

}