/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author long
 */
public class MyStringBuilder {
    
    String str;
    
    public static class Builder {
        
        String myStr = "";

        public Builder(String myStr) {
            this.myStr = myStr;
        }

        public Builder() {
        }
                
        public Builder addString(String s) {
            this.myStr = this.myStr.concat(s);
            return this;
        }

        public Builder addFloat(float f) {
            this.myStr = this.myStr.concat(Float.toString(f));
            return this;
        }

        public Builder addBool(boolean b) {
            this.myStr = this.myStr.concat(Boolean.toString(b));
            return this;
        }
        
        public MyStringBuilder build() {
            return new MyStringBuilder(this);
        }
    }
    
    protected MyStringBuilder (Builder builder) {
        this.str = builder.myStr;
    }
    
    @Override
    public String toString() {
        return "My String = " + str;
    }
}
