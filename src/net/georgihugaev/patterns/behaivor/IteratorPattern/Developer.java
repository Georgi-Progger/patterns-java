package net.georgihugaev.patterns.behaivor.IteratorPattern;

public class Developer implements Collection{
    String[] skills;

    public Developer(String[] skills) {
        this.skills = skills;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if (index < skills.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
