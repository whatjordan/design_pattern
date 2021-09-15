package behavior.interpreter;

import java.util.Arrays;
import java.util.Iterator;

public class Context {
    private Iterator<String> fragments;
    private String currentFragment;

    public Context(String text) {
        if (text == null) {
            throw new NullPointerException();
        }
        fragments = Arrays.asList(text.split(" ")).iterator();
        nextFragment();
    }

    public void nextFragment() {
        if (fragments.hasNext()) {
            currentFragment = fragments.next();
        } else {
            currentFragment = null;
        }
    }

    public String getCurrentFragment() {
        return currentFragment;
    }

    public void skipFragment(String fragment) {
        if (!fragment.equals(currentFragment)) {
            throw new IllegalArgumentException();
        }
        nextFragment();
    }

}
