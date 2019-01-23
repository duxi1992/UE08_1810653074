 package Aufgabe1;
public class eigeneVerschlüsselung {

    private int switchIt = -1;

    public eigeneVerschlüsselung() {
        this(3);
    }

    public eigeneVerschlüsselung(int switchIt) {
        setSwitchIt(switchIt);
    }

    public int getSwitchIt() {
        return this.switchIt;
    }

    public void setSwitchIt(int switchIt) {
        this.switchIt = switchIt;
    }


    public String encrypt(String text) {

       StringBuffer encrypted = new StringBuffer();
        for (int i = 0; i < text.length(); i++) { char cur = text.charAt(i); if (cur > 96 && cur < 123) { cur += getSwitchIt(); if (cur > 'z') {
        cur -= 26;
        }
        encrypted.append(cur);
        }
        }
        return encrypted.toString().toUpperCase();
        }
        }
