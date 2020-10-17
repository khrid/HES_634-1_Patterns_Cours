package ch.hevs.design_patterns.lab10_composite_pattern_ex1;

import ch.hevs.design_patterns.lab10_composite_pattern_ex1.algorithms.BFSSearch;
import ch.hevs.design_patterns.lab10_composite_pattern_ex1.algorithms.DFSSearch;
import ch.hevs.design_patterns.lab10_composite_pattern_ex1.algorithms.TraversalAlgoritm;
import ch.hevs.design_patterns.lab10_composite_pattern_ex1.component.Component;
import ch.hevs.design_patterns.lab10_composite_pattern_ex1.composite.Composite;
import ch.hevs.design_patterns.lab10_composite_pattern_ex1.leaf.Leaf;

/**
 * Lab 10
 * @author scz
 */
public class TestTraversalAlgoritms {

    public static void main(String[] args) {
        TestTraversalAlgoritms launcher = new TestTraversalAlgoritms();
        launcher.launch();
    }

    public void launch() {

        Component treeRoot = this.createTreeStruct();

        //Instanciating one searchAlgoritm of each type.
        TraversalAlgoritm dfs = new DFSSearch();
        TraversalAlgoritm bfs = new BFSSearch();

        //Launching DFS search for one existing element.
        Component result = dfs.search(treeRoot, "Leaf 5");
        System.out.println("1 element found by DFS: " + result);

        //Launching BFS search for one existing element.
        result = bfs.search(treeRoot, "Leaf 5");
        System.out.println("1 element found by BFS : " + result);
    }

    //1. We create the tree.
    //         node1
    //         /    \
    //		node2	node3
    //		/  \	/   \
    //	   l1  n4  n5   n6
    //		   /\   \   / \
    //       l2 l3  l4 l5 l6
    //
    //Creating the leafs.
    private Component createTreeStruct() {
        Leaf l1 = new Leaf("Leaf 1");
        Leaf l2 = new Leaf("Leaf 2");
        Leaf l3 = new Leaf("Leaf 3");
        Leaf l4 = new Leaf("Leaf 4");
        Leaf l5 = new Leaf("Leaf 5");
        Leaf l6 = new Leaf("Leaf 6");

        //Creating the nodes
        Composite n1 = new Composite("Node 1");
        Composite n2 = new Composite("Node 2");
        Composite n3 = new Composite("Node 3");
        Composite n4 = new Composite("Node 4");
        Composite n5 = new Composite("Node 5");
        Composite n6 = new Composite("Node 6");

        //Assigning leaf and nodes to parents (nodes).
        n6.add(l5);
        n6.add(l6);
        n5.add(l4);
        n4.add(l2);
        n4.add(l3);
        n3.add(n5);
        n3.add(n6);
        n2.add(l1);
        n2.add(n4);
        n1.add(n2);
        n1.add(n3);

        return n1;
    }
}
