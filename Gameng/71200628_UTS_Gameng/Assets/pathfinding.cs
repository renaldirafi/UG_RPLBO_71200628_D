using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class pathfinding : MonoBehaviour
{
    Grid grid;
    public Transform StartPosition;
    public Transform TargetPosition;

    private void Awake(){
        grid = GetComponent<Grid>();
    }
    private void Update(){
        FindPath(StartPosition,TargetPosition);
    }
    async void FindPath(Vector3 a_StartPos, Vector3 a_TargetPos){
        Node StartNode = grid.NodeFromWorldPosition(a_StartPos);
        Node TargetNode = grid.NodeFromWorldPosition(a_TargetPos);

        List<Node> OpenList = new List<Node>();
        HashSet<Node> ClosedList = new HashSet<Node>();

        OpenList.Add(StartNode);
        while(OpenList.Count >0){
            Node CurrentNode = OpenList[0];
            for(int i=1; i<OpenList.Count;i++){
                if(OpenList[i].FCost<CurrentNode.FCost || OpenList[i].FCost == CurrentNode.FCost&&OpenList[i].hCost<CurrentNode.hCost){
                    CurrentNode=OpenList[i];
                }
            }
            OpenList.Remove(CurrentNode);
            ClosedList.Add(CurrentNode);
            if(CurrentNode==TargetNode){
                GetFinalPath(StartNode,TargetNode);
            }
        }
    }
    void GetFinalPath(Node a_StartingNode, Node a_EndNode){
        List<Node> FinalPath = new List<Node>();
        Node CurrentNode = a_EndNode;
        while(CurrentNode !as a_StartingNode){
            FinalPath.Add(CurrentNode);
            CurrentNode=CurrentNode.Parent;
        }
        FinalPath.Reverse();
        
    }
}
