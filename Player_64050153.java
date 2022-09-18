class Player_64050153 extends Player implements Talkable {
    public void setName(){
        this.name = "PXNYA";
    }
    public void setColor(){
        setColor(54,199,88);
    }
    public void setStat(){
        int str = 7;
        int dex = 10;
        int vit = 3;
      
        for(int k = 0; k< str; k++){
            addDex();
        }
        for(int k = 0; k< dex; k++){
            addDex();
        }
        for(int k = 0; k< vit; k++){
            addVit();
        }
    }
        public void setWeapon(){
            weapon = new Knife();
        }

        public String endTalk() {
            return "SPAA";
        }
        public String beginTalk() {
            return "เข้ามาเลย";
        }
    }