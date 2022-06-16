class Pet {
    private int energyMax, hungryMax, cleanMax;
    private int energy, hungry, shower;
    private int diamonds;
    private int age;
    private boolean alive;

    /**
     * Atribui o valor de energia Se o valor ficar abaixo de 0, o pet morre de
     * fraqueza
     * Garanta que os valores ficarão no interalo 0 - max
     * Use esse modelo para fazer os outros métodos set
     */

    public void setEnergy(int value) {
        if (value <= 0) {
            this.energy = 0;
            System.out.println("fail: pet morreu de fraqueza");
            this.alive = false;
        } else if (value > this.energyMax) {
            this.energy = this.energyMax;
        } else
            this.energy = value;
    }

    public void setHungry(int value) {
        if (value <= 0) {
            this.hungry = 0;
            System.out.println("fail: pet morreu de fome");
            this.alive = false;
        } else {
            if (value > this.hungryMax) {
                this.hungry = hungryMax;
            } else {
                this.hungry = value;
            }
        }
    }

    public void setClean(int value) {
        if (value <= 0) {
            this.shower = 0;
            System.out.println("fail: pet morreu de sujeira");
            this.alive = false;
        } else {
            if (value > this.cleanMax) {
                this.shower = cleanMax;
            } else {
                this.shower = value;
            }
        }
    }

    public Pet(int energy, int hungry, int shower) {
        energyMax = energy;
        hungryMax = hungry;
        cleanMax = shower;
        this.energy = energy;
        this.hungry = hungry;
        this.shower = shower;
    }

    @Override
    public String toString() {
        return String.format("E:" + energy + "/" + energyMax + " S:" + hungry + "/" + hungryMax + " L:" + shower + "/" + cleanMax + " D:" + diamonds + " I:" + age);
    }

    private boolean testAlive() {
        if (energy > 0 && hungry > 0 && shower > 0) {
            return true;
        } else {
            System.out.println("fail: pet esta morto");
        }
        return false;
    }

    // Invoca o método testAlive para verificar se o pet esta vivo
    // Se estiver vivo, altere os atributos utilizando os métodos set e get
    public void play() {
        if (testAlive() == true) {
            setEnergy(getEnergy() - 2);
            setHungry(getHungry() - 1);
            setClean(getClean() - 3);
            setDiamonds(diamonds + 1);
            setAge(getAge() + 1);
        }
    }

    public void shower() {
        if (testAlive() == true) {
            setEnergy(getEnergy() - 3);
            setHungry(getHungry() - 1);
            setClean(getCleanMax());
            setAge(getAge() + 2);
        }
    }

    public void eat() {
        if (testAlive() == true) {
            setEnergy(getEnergy() - 1);
            setHungry(getHungry() + 4);
            setClean(getShower() - 2);
            setAge(getAge() + 1);
        }
    }

    public void sleep() {
        if (testAlive() == true && getEnergyMax() - getEnergy() >= 5) {
            age += energyMax - energy;
            setEnergy(getEnergyMax());
            setHungry(getHungry() - 1);
        } else if (testAlive() == false) {
            System.out.println("fail: pet esta morto");
        } else {
            System.out.println("fail: nao esta com sono");
        }
    }

    // Métodos GET
    public int getClean() {
        return shower;
    }
    public int getHungry() {
        return hungry;
    }
    public int getEnergy() {
        return energy;
    }
    public int getEnergyMax() {
        return energyMax;
    }
    public int getCleanMax() {
        return cleanMax;
    }
    public int getHungryMax() {
        return hungryMax;
    }
    public int getShower() {
        return shower;
    }
    public int getAge() {
        return age;
    }
    public int getDiamonds() {
        return diamonds;
    }

    // Métodos SET
    public void setShower(int shower) {
        this.shower = cleanMax;
    }
    public void setDiamonds(int diamonds) {
        this.diamonds = diamonds;
    }
    public void setAge(int age) {
        this.age = age;
    }
}