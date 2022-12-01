package models;

import java.util.ArrayList;

public class Group {
String groupName;
    ArrayList<Group> groups;

    public Group(String groupName, ArrayList<Team> groups) {
        this.groupName = groupName;
        this.groups = groups;
    }

    public String getGroupName() {
        return groupName;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }
}
