# **Homework project**


## **1. Single Responsibility Principle (SRP)**
Each class now has a single responsibility:
Player: Manages player attributes (name, health, experience, inventory).
Enemy (interface): Defines the behavior of enemies (attack, experience reward).
Item (interface): Defines the behavior of items (apply effect to the player).
LevelManager: Manages the current level, enemies, and items.
Game: Handles the game logic (combat, item pickups, level progression).
By separating responsibilities, the code is easier to understand, maintain, and test.

## **2. Open/Closed Principle (OCP)**
The design is open for extension but closed for modification:
Adding new enemies: Create a new class (e.g., Dragon) that implements the Enemy interface. No need to modify existing code.
Adding new items: Create a new class (e.g., Potion) that implements the Item interface. No need to modify existing code.
Adding new levels: Extend the LevelManager to include new level configurations without changing the core logic.
This makes the system more flexible and scalable.

# **3. Liskov Substitution Principle (LSP)**
All subclasses (e.g., Skeleton, Zombie, Vampire) can be used interchangeably with their base type (Enemy). Similarly, all items (GoldCoin, HealthElixir, MagicScroll) can be used interchangeably with their base type (Item).

# **4. Interface Segregation Principle (ISP)**
Interfaces are small and focused:
Enemy: Only defines methods related to enemies (getName, attack, getExperienceReward).
Item: Only defines methods related to items (getName, applyEffect).
This ensures that classes only depend on the methods they actually use, reducing unnecessary coupling.

# **5. Dependency Inversion Principle (DIP)**
High-level modules (e.g., Game) depend on abstractions (Enemy, Item), not concrete implementations:
Game depends on Player, LevelManager, and the abstractions Enemy and Item.
LevelManager depends on the abstractions Enemy and Item.
This makes the system more modular and easier to test or extend.

## **Steps Taken for Refactoring**
### **Identify Responsibilities:**

Split the monolithic class into smaller, cohesive classes:

 **Player** for player management.

**Enemy** and its implementations for enemy behavior.

**Item** and its implementations for item behavior.

**LevelManager** for level management.

**Game** for game logic.

### **Define Abstractions:**

Created interfaces (Enemy, Item) to define common behavior for enemies and items.

### **Encapsulate Data:**

Moved player attributes (name, health, experience, inventory) into the Player class.

Moved level-specific data (enemies, items) into the LevelManager class.

### **Decouple Logic:**

Separated combat logic into the Enemy implementations.

Separated item effects into the Item implementations.

Separated level progression into the LevelManager.

### **Use Dependency Injection:**

The Game class depends on abstractions (Enemy, Item) rather than concrete implementations.
  

