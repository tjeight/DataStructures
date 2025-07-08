from abc import  ABC,abstractmethod


class Vehicle(ABC):

    @abstractmethod
    def demo(self):
        pass



class Fortuner(Vehicle):

    def demo(self):
        print("This is abstract method implementation")
