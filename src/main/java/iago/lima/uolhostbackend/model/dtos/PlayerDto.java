package iago.lima.uolhostbackend.model.dtos;

import iago.lima.uolhostbackend.model.GroupType;

public record PlayerDto(String name, String email, String phoneNumber, GroupType groupType) {
}
