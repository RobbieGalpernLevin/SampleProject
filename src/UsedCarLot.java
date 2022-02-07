import java.util.ArrayList;

/**
 * This is a used car Class
 *
 * @author Robbie Galpern-Levin
 */
public class UsedCarLot
{

    /**
     * The inventory of the Used Car Lot
     */
    private ArrayList<Car> inventory;

    /**
     * Initiates a UsedCarLot object
     */
    public UsedCarLot()
    {
      inventory = new ArrayList<Car>();
    }

    /**
     * Returns the current inventory
     *
     * @return The inventory of the lot
     */
    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    /**
     * Adds a car to the lot's inventory
     *
     * @param carToAdd the car being added
     */
    public void addCar(Car carToAdd) {
        inventory.add(carToAdd);
    }

    /**
     * Swaps two cars in the lot's inventory
     *
     * @param index1 the first car being swapped
     * @param index2 the second car being swapped
     * @return true or false based on whether the swap is successful
     */
    public boolean swap(int index1, int index2)
    {
        if(index1 < inventory.size() && index2 < inventory.size() && index1 >= 0 && index2 >= 0)
        {
            Car car1 = inventory.get(index1);
            Car car2 = inventory.get(index2);
            inventory.set(index2, car1);
            inventory.set(index1, car2);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Adds a new car to the lot's inventory at a specific index
     * <p>
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     *
     * @param indexToAdd the index where the car will be added
     * @param carToAdd the car being added
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * Removes one sold car from the lot's inventory and shifts other card to fill the space
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell index of the car being sold
     * @return the sold car
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        /* IMPLEMENT ME */
        Car car = inventory.remove(indexOfCarToSell);
        return car;
    }

    /**
     * Removes one sold car from the lot's inventory
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell index of the car being sold
     * @return the sold car
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        /* IMPLEMENT ME */
        Car car = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return car;
    }


    /**
     * Moves a car at one index to a new specified index
     * <p>
     * PRECONDITIONS: indexOfCarToMove &lt; inventory.size() destinationIndex &lt; inventory.size()
     *
     * @param indexOfCarToMove current index of the car being moved
     * @param destinationIndex index the car will move to
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        /* IMPLEMENT ME */
        Car car = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, car);
    }

}