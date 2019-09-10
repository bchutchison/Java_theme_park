import behaviours.ISites;

import java.util.ArrayList;

public class ThemePark {

private ArrayList<ISites> sites;

public ThemePark(){
    this.sites = new ArrayList<>();
}

public int countAttractions() {
    return sites.size();
}

public void addAttraction(ISites site) {
    sites.add(site);
}


}
